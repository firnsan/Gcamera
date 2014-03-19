package com.axlecho.gccamera;

import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import com.example.jpg_test.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static ImageView iv;
	private static Bitmap bm;
	private final static int SHOWPIC = 1;

	private InputStream sin;
	private Socket s;
	private DatagramSocket ds;
	private Data d;
	private PicGettingThread pgt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// no title
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		// full screen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		iv = (ImageView) findViewById(R.id.camera);

		try {
			(new Data()).get_dp_a0();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	private class PicGettingThread extends Thread {

		public void run() {

			while (true) {
				byte buffer[] = new byte[0x30000];
				byte picSizebuf[] = new byte[0x04];
				int picSize = -1;
				try {
					// Thread.sleep(100);
					ds.send(d.get_dp_a0());
					ds.send(d.get_dp_46());

					sin.read(picSizebuf); // jpeg
					sin.read(picSizebuf); // picsize
					Log.i("axlecho", picSizebuf[0] + " " + picSizebuf[1] + " " + picSizebuf[2] + " " + picSizebuf[3]);
					picSize = Tool.byteArray2int(picSizebuf);
					Log.i("axlecho", "pic size:" + picSize);

					int tmpSize = 0;
					while (tmpSize < picSize) {
						int ret = sin.read(buffer, tmpSize, picSize - tmpSize);
						tmpSize += ret;
						// Log.i("axlecho", "read data" + ret);
					}

					bm = BitmapFactory.decodeByteArray(buffer, 0, picSize);
					if (bm == null) {
						Log.e("axlecho", "bitmap is null");

						// ds.close();
						// sin.close();
						return;
					}

				} catch (IOException e) {
					e.printStackTrace();
					Log.d("axlecho", "jump out the thread:ioexception");
					return;
				}

				// show the pic
				msgHandler.sendEmptyMessage(SHOWPIC);
			}
		}
	}

	private static Handler msgHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			switch ((int) msg.what) {
			case SHOWPIC:
				iv.setImageBitmap(bm);
				break;
			}
		}
	};

	@Override
	protected void onStart() {
		try {

			s = new Socket("192.168.1.1", 7505);
			sin = s.getInputStream();

			Log.i("axlecho", "setup tcp socket");

			d = new Data();
			ds = new DatagramSocket();

			Log.i("axlecho", "setup udp socket");
			ds.send(d.get_dp_2f());
			ds.send(d.get_dp_a0());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		pgt = new PicGettingThread();
		pgt.start();

		Log.i("axlecho", "setup thread");
		super.onStart();
	}

	@Override
	protected void onStop() {
		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ds.close();
		Log.i("axlecho", "close socket.");
		super.onStop();
	}
}
