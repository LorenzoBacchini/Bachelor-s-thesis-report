//Camera calibration
final CameraCalibrator cc = new CameraCalibrator(squaresX, squaresY, directoryPath);
final List<Mat> cameraParam = cc.calibration();

//Camera pose estimation
final CameraPose cp = new CameraPose(cameraParam.get(0), cameraParam.get(1), 
	markerLength, dictionaryType, selectedCamera);
cp.calcPose();