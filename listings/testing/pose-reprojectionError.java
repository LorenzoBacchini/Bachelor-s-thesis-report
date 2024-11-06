private double calculateReprojectionError(final MatOfPoint3f objPoints, 
	final MatOfPoint2f imgPoints, final Mat rvec, final Mat tvec) {
	final MatOfPoint2f projectedPoints = new MatOfPoint2f();
	Calib3d.projectPoints(objPoints, rvec, tvec, cameraMatrix, new MatOfDouble(distCoeffs), projectedPoints);

	// Calculating reprojection error
	final double error = Core.norm(imgPoints, projectedPoints, Core.NORM_L2);
	projectedPoints.release();
	return error;
}