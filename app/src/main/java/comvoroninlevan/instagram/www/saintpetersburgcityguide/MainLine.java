package comvoroninlevan.instagram.www.saintpetersburgcityguide;

/**
 * Created by Леван on 31.08.2016.
 */
public class MainLine {

    private int mSmallPhotoId;
    private String mAnnotation;

    public MainLine(int smallPhotoId, String annotation) {

        mSmallPhotoId = smallPhotoId;
        mAnnotation = annotation;
    }

    public int getSmallPhotoId() {
        return mSmallPhotoId;
    }
    public String getAnnotation() {
        return mAnnotation;
    }
}
