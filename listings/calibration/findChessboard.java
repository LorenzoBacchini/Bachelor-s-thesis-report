final Mat image = Imgcodecs.imread(filePath);
final Mat grayImage = new Mat();
//Converting to a gray scale image to reduce computational complexity
Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

final MatOfPoint2f imageCorners = new MatOfPoint2f();
//Scanning the image to extract the corners
final boolean found = Calib3d.findChessboardCorners(grayImage, boardSize, imageCorners);