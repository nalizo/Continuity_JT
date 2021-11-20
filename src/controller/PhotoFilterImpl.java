package controller;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import data.ConstHolder;
import data.Photo;
import network.SynchronicRestCalls;

public class PhotoFilterImpl implements PhotoFilter {
    private Gson gson;
    private SynchronicRestCalls restGet;
    
    ConstHolder constHolder = new ConstHolder();
    
    public PhotoFilterImpl(){
        gson = new Gson();
        restGet = new SynchronicRestCalls();
    }
    

	public boolean albumWithPhotosMoreThenThresholdIND(int albumID, int threshold) throws IOException {
		//get photos list per AlbumID
		//gsonRestCalls restGet = new gsonRestCalls();
		String jsonString = restGet.restGetByURL(constHolder.PHOTOS_BY_ALBUM_URL + albumID);
		List<Photo> photos = gson.fromJson(jsonString, new TypeToken<List<Photo>>() {}.getType());
		
		//check Threshold
		if (photos.size() > threshold)
			return true;
		return false;
	}
}
