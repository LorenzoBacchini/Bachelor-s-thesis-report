//finishing the corners with the cornerSubPix method
if (found) {
	Imgproc.cornerSubPix(grayImage, imageCorners, new Size(WIN_X_SIZE, WIN_Y_SIZE), 
        new Size(ZERO_X_ZONE, ZERO_Y_ZONE),
        new TermCriteria(TermCriteria.EPS + TermCriteria.COUNT, MAX_ITERATION, ACCURACY));

	imagePoints.add(imageCorners);
	objectPoints.add(objectPoint);
}