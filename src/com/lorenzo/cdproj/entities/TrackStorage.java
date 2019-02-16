package com.lorenzo.cdproj.entities;

import java.util.List;

/**
 * This interface will contain methods that will generally
 * be needed by classes that will be depending on classes
 * that inherits {@link TrackStorage}.
 *
 * Implementation could be something like albums, vinyls,
 * records, tape, etc.
 */
public interface TrackStorage {

  /**
   *  Get the title of this {@link TrackStorage}
   *
   * @return title in {@link String}
   */
  String getTitle();

  /**
   * In some cases, a {@link TrackStorage} can have multiple
   * artists because they collaborate and feature each other.
   * This is why, this methods returns {@link List} of {@link String}
   * that represents a list of artists' name/handle.
   *
   * @return List of artists' name.
   */
  List<String> getArtists();

  /**
   * Like the {@link TrackStorage#getArtists()} method, a {@link TrackStorage}
   * could also have multiple genres since artists can sometimes get
   * creative and change genre of tracks throughout the album, record, or tape.
   *
   * @return List of genres.
   */
  List<String> getGenres();

  /**
   * Get a list of all of the tracks in this {@link TrackStorage}
   *
   * @return return List of tracks.
   */
  List<Track> getTracks();

  /**
   * Build pattern to easily add tracks when implementing
   * {@link TrackStorage}.
   *
   * This class will also automatically append genres and
   * artists.
   *
   * @param track Instance of {@link Track} that will be added.
   * @return return this class to allow another call for this method.
   */
  default TrackStorage addTrack(Track track) {
    if(!getTracks().contains(track)) {
      getTracks().add(track);
      if(!getArtists().contains(track.getArtist()))
        getArtists().add(track.getArtist());
      if(!getGenres().contains(track.getGenre()))
        getGenres().add(track.getGenre());
    }
    return this;
  }
}
