package com.example.jpg_test;

public class Tool {
	public static int byteArray2int(byte[] b) {
		int v0 = (b[0] & 0xff);
		int v1 = (b[1] & 0xff) << 8;
		int v2 = (b[2] & 0xff) << 16;
		int v3 = (b[3] & 0xff) << 24;
		return v0 + v1 + v2 + v3;
	}

	public static byte[] long2byteArray(long x) {
		byte bb[] = new byte[8];
		bb[0] = (byte) (x >> 56);
		bb[1] = (byte) (x >> 48);
		bb[2] = (byte) (x >> 40);
		bb[3] = (byte) (x >> 32);
		bb[4] = (byte) (x >> 24);
		bb[5] = (byte) (x >> 16);
		bb[6] = (byte) (x >> 8);
		bb[7] = (byte) (x >> 0);
		return bb;
	}
}
