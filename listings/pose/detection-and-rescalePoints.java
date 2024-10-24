arucoDetector.detectMarkers(gray, corners, ids);
if (!corners.isEmpty()) {
	rescalePoints(corners);
}