package com.teamtreehouse.model;

/**
 * Created by thomasle on 9/20/16.
 */
public class SongRequest {
    private String mSingerName;
    private Song mSong;

    public SongRequest(String singerName, Song song) {
        mSong = song;
        mSingerName = singerName;
    }

    public String getSingerName() {
        return mSingerName;
    }

    public void setSingerName(String singerName) {
        mSingerName = singerName;
    }

    public Song getSong() {
        return mSong;
    }

    public void setSong(Song song) {
        mSong = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongRequest that = (SongRequest) o;

        if (!mSingerName.equals(that.mSingerName)) return false;
        return mSong.equals(that.mSong);

    }

    @Override
    public int hashCode() {
        int result = mSingerName.hashCode();
        result = 31 * result + mSong.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSingerName='" + mSingerName + '\'' +
                ", mSong=" + mSong +
                '}';
    }
}
