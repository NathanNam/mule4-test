package org.mule.extension;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class CookbookConnection {

  private final String id;

  public CookbookConnection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}
