package comvoroninlevan.instagram.www.saintpetersburgcityguide;

/**
 * Created by Леван on 04.09.2016.
 */
public class DetailedInformation {

    private int mBigPhotoId;
    private String mHeader;
    private String mMainText;
    private String mShowOnMap;

    public DetailedInformation(int bigPhotoId, String header, String mainText){
        mBigPhotoId = bigPhotoId;
        mHeader = header;
        mMainText = mainText;
    }

    public DetailedInformation(String showOnMap){
        mShowOnMap = showOnMap;
    }

    public int getBigPhoto(){
        return mBigPhotoId;
    }
    public String getHeader(){
        return mHeader;
    }
    public String getMainText(){
        return mMainText;
    }
    public String getShowOnMap(){
        return mShowOnMap;
    }
}
