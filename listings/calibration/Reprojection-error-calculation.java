//Reprojection error calculation
double totalError = 0;
double totalPoints = 0;
for (int i = 0; i < objectPoints.size(); i++) {
	final MatOfPoint2f projectedPoints = new MatOfPoint2f();
        Calib3d.projectPoints(new MatOfPoint3f(objectPoints.get(i)), rvecs.get(i), tvecs.get(i), 
        	cameraMatrix, new MatOfDouble(distCoeffs), projectedPoints);
	final MatOfPoint2f imgPoints = new MatOfPoint2f(imagePoints.get(i));
        final double error = Core.norm(imgPoints, projectedPoints, Core.NORM_L2);
        totalError += error * error;
        totalPoints += objectPoints.get(i).total();
}
final double meanError = Math.sqrt(totalError / totalPoints);