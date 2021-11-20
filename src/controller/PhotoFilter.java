package controller;

import java.io.IOException;

public interface PhotoFilter {
	public boolean albumWithPhotosMoreThenThresholdIND(int albumID, int threshold) throws IOException;
}
