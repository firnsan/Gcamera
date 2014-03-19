package com.axlecho.gccamera;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import android.os.SystemClock;
import android.util.Log;

public class Data {
	final static byte data_a0[] = new byte[] { 0x0A, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x5C, (byte) 0xA3, (byte) 0x9E, (byte) 0x03,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xCA, (byte) 0x62, (byte) 0x88, (byte) 0x77, (byte) 0x57, (byte) 0x23,
			(byte) 0x13, (byte) 0x75, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x70, (byte) 0x23, (byte) 0x13, (byte) 0x75,
			(byte) 0x8E, (byte) 0x43, (byte) 0xE2, (byte) 0x3D, (byte) 0xDF, (byte) 0x11, (byte) 0x5D, (byte) 0x75, (byte) 0x90, (byte) 0x70,
			(byte) 0x50, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x24, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0x69, (byte) 0x67, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xCC, (byte) 0xFF, (byte) 0xF4, (byte) 0x01, (byte) 0xB9, (byte) 0x2F, (byte) 0x15, (byte) 0x75,
			(byte) 0x1A, (byte) 0xA1, (byte) 0x05, (byte) 0x49, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x7C, (byte) 0xFF,
			(byte) 0xF4, (byte) 0x01, (byte) 0x93, (byte) 0x22, (byte) 0x13, (byte) 0x75 };

	final static byte data_42[] = new byte[] { 0x42, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE7, (byte) 0x66, (byte) 0xA3, (byte) 0x03,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x79, (byte) 0x3D, (byte) 0x6F, (byte) 0x75, (byte) 0x48, (byte) 0x3D, (byte) 0x40, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x06, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x8C, (byte) 0xF8, (byte) 0xBE, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x5E, (byte) 0x3E, (byte) 0x6F, (byte) 0x75, (byte) 0x8C, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x1C, (byte) 0x40, (byte) 0x41, (byte) 0x00, (byte) 0x0C, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE0, (byte) 0xF8,
			(byte) 0xBE, (byte) 0x01, (byte) 0x00, (byte) 0xF9, (byte) 0xBE, (byte) 0x01, (byte) 0x10, (byte) 0xF9, (byte) 0xBE, (byte) 0x01,
			(byte) 0x09, (byte) 0x36, (byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x16, (byte) 0x36, (byte) 0x40, (byte) 0x00, (byte) 0xC0, (byte) 0x36, (byte) 0x41, (byte) 0x00,
			(byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x79, (byte) 0x3D, (byte) 0x6F, (byte) 0x75, (byte) 0x97, (byte) 0x2A, (byte) 0x40, (byte) 0x00,
			(byte) 0x84, (byte) 0x34, (byte) 0x41, (byte) 0x00, (byte) 0xA0, (byte) 0x34, (byte) 0x41, (byte) 0x00, (byte) 0xC0, (byte) 0xA8,
			(byte) 0x01, (byte) 0x01, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00 };

	final static byte data_46[] = new byte[] { 0x46, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE7, (byte) 0x66, (byte) 0xA3, (byte) 0x03,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x79, (byte) 0x3D, (byte) 0x6F, (byte) 0x75, (byte) 0x48, (byte) 0x3D, (byte) 0x40, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x06, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x8C, (byte) 0xF8, (byte) 0xBE, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x5E, (byte) 0x3E, (byte) 0x6F, (byte) 0x75, (byte) 0x8C, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x1C, (byte) 0x40, (byte) 0x41, (byte) 0x00, (byte) 0x0C, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE0, (byte) 0xF8,
			(byte) 0xBE, (byte) 0x01, (byte) 0x00, (byte) 0xF9, (byte) 0xBE, (byte) 0x01, (byte) 0x10, (byte) 0xF9, (byte) 0xBE, (byte) 0x01,
			(byte) 0x09, (byte) 0x36, (byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x16, (byte) 0x36, (byte) 0x40, (byte) 0x00, (byte) 0xC0, (byte) 0x36, (byte) 0x41, (byte) 0x00,
			(byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x79, (byte) 0x3D, (byte) 0x6F, (byte) 0x75, (byte) 0x97, (byte) 0x2A, (byte) 0x40, (byte) 0x00,
			(byte) 0x84, (byte) 0x34, (byte) 0x41, (byte) 0x00, (byte) 0xA0, (byte) 0x34, (byte) 0x41, (byte) 0x00, (byte) 0xC0, (byte) 0xA8,
			(byte) 0x01, (byte) 0x01, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00 };

	final static byte data_2f[] = new byte[] { 0x2F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE2, (byte) 0xE8, (byte) 0x1E, (byte) 0x04,
			(byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x80, (byte) 0x02,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x18, (byte) 0x41, (byte) 0x1D, (byte) 0x00, (byte) 0x10, (byte) 0x27,
			(byte) 0x00, (byte) 0x00, (byte) 0xF0, (byte) 0x3C, (byte) 0x1D, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x18, (byte) 0xFE, (byte) 0x0A, (byte) 0x03, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xC8, (byte) 0xFE, (byte) 0x0A, (byte) 0x03, (byte) 0xCA, (byte) 0x6A, (byte) 0x82, (byte) 0x74,
			(byte) 0x6E, (byte) 0x1F, (byte) 0xEC, (byte) 0x9A, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xD8, (byte) 0xFE,
			(byte) 0x0A, (byte) 0x03, (byte) 0x61, (byte) 0x3C, (byte) 0x6E, (byte) 0x75, (byte) 0x04, (byte) 0x03, (byte) 0x00, (byte) 0x00,
			(byte) 0xFF, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x06, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x0C, (byte) 0xFF,
			(byte) 0x0A, (byte) 0x03, (byte) 0x6A, (byte) 0x3C, (byte) 0x6E, (byte) 0x75, (byte) 0x40, (byte) 0x12, (byte) 0x1C, (byte) 0x00,
			(byte) 0x7F, (byte) 0xA6, (byte) 0x9C, (byte) 0xEC, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0xC0, (byte) 0xA8,
			(byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01,
			(byte) 0xC0, (byte) 0xA8, (byte) 0x01, (byte) 0x01, (byte) 0x04, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0xE3, (byte) 0x6E,
			(byte) 0x40, (byte) 0x00, (byte) 0xF8, (byte) 0x99, (byte) 0x52, (byte) 0x00 };

	private InetAddress sa;

	public Data() throws UnknownHostException {
		sa = InetAddress.getByName("192.168.1.1");
	}

	public DatagramPacket get_dp_a0() {
		long date = SystemClock.uptimeMillis();
		System.arraycopy(Tool.long2byteArray(date),4, Data.data_a0, 4, 4);
		return new DatagramPacket(Data.data_a0, Data.data_a0.length, sa, 6060);
	}

	public DatagramPacket get_dp_46() {
		long date = SystemClock.uptimeMillis();
		System.arraycopy(Tool.long2byteArray(date), 4, Data.data_46, 4, 4);
		return new DatagramPacket(Data.data_46, Data.data_46.length, sa, 6060);
	}

	public DatagramPacket get_dp_2f() {
		long date = SystemClock.uptimeMillis();
		System.arraycopy(Tool.long2byteArray(date), 4, Data.data_2f, 4, 4);
		return new DatagramPacket(Data.data_2f, Data.data_2f.length, sa, 6060);
	}

}