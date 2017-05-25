package com.example.android.miwok;

/**
 * Created by admin on 8/05/2017.
 * {@Link Word} represents a voc word that the user wants to learn.
 * it contains the default translation and a Miwok translation of that word
 */

public class Word {

    //    No image provides (in caps because its a constant)
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * default translation of the word
     **/
    private String mDefaultTranslation;
    /**
     * MiwokTranslation of the word
     **/
    private String mMiwokTranslation;
    /**
     * Image
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     *                           !!!!!!!!!!!!!!!!! same name, but with multiple usages (this one has an image int)
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

//    get the image resource id

    public int getImageResourceId() {
        return mImageResourceId;
    }

//    is there an image for the word?
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
