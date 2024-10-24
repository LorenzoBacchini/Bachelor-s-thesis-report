final InputParameters ip = new InputParameters();
ip.createWindow();

// Wait for the user to set the parameters
final int squaresX = ip.getSquaresX();
final int squaresY = ip.getSquaresY();
final float markerLength = ip.getMarkerLength();
final String directoryPath = ip.getDirectoryPath();
final int selectedCamera = ip.getCameraIndex();
final int dictionaryType = convertDictionary(ip.getDictionaryType());
// Close the input parameters window
ip.close();