package controller;

import java.io.IOException;
import java.util.List;

import data.Album;

public interface AlbumFilter {
	public List<Album> usersWithPhotosThreshold(Integer userID, Integer photosThreshold) throws IOException;
}
