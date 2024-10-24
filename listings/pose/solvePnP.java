Calib3d.solvePnP(objPoints, cornerPoints, cameraMatrix, 
	new MatOfDouble(distCoeffs), rvec, tvec, 
	false, Calib3d.SOLVEPNP_ITERATIVE
);