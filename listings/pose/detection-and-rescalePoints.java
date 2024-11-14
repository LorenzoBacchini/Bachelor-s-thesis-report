final Mat gray = new Mat();
Imgproc.cvtColor(reducedFrame, gray, Imgproc.COLOR_BGR2GRAY);

//Corners and ids of the detected markers
final List<Mat> corners = new ArrayList<>();
final Mat ids = new Mat();

//Detecting the markers
arucoDetector.detectMarkers(gray, corners, ids);
if (!corners.isEmpty()) {
	rescalePoints(corners);
}