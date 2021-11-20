package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import data.Album;
import data.ConstHolder;
import network.SynchronicRestCalls;

//lambda filter java 8
public class AlbumFilterImpl implements AlbumFilter {
	
    private Gson gson;
    private SynchronicRestCalls restGet;
    
    ConstHolder constHolder = new ConstHolder();
    
    public AlbumFilterImpl(){
        gson = new Gson();
        restGet = new SynchronicRestCalls();
    }
    
	public List<Album> usersWithPhotosThreshold(Integer userID, Integer photosThreshold) throws IOException {
				
		//get all albums
		String jsonString = restGet.restGetByURL(constHolder.ALBUM_URL);
        List<Album> albums = gson.fromJson(jsonString, new TypeToken<List<Album>>() {}.getType());
        
        //remove albums that dont match the userID
        albums.removeIf(myList -> myList.getUserID() != userID);
        
        //for each album check if photos count is higher then Threshold - add them to a side list
        PhotoFilterImpl photofilter = new PhotoFilterImpl();
        List<Album> found = new ArrayList<Album>();
        for(Album album : albums){
            if(photofilter.albumWithPhotosMoreThenThresholdIND(album.getAlbumID(), photosThreshold) == false) {
                found.add(album);
            }
        }
        //delete the side list from the main list
        albums.removeAll(found);
        
		return albums;
	}
}

