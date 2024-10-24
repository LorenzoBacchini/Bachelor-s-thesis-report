private static void rescalePoints(final List<Mat> corners) {
	for (final Mat corner : corners) {
		for (int i = 0; i < CORNER_NUMBER; i++) {
			final double[] data = corner.get(0, i);
			data[0] *= SCALE;
			data[1] *= SCALE;
			corner.put(0, i, data);
		}
	}
}