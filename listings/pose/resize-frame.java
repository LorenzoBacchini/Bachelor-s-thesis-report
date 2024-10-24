//Resize the frame to speed up the marker detection
final Mat reducedFrame = new Mat();
Imgproc.resize(frame, reducedFrame, new Size((double) frame.width() / SCALE, (double) frame.height() / SCALE));