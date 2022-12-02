/* (C)2020 */
package saps.catalog.core.retry.catalog;

import saps.catalog.core.Catalog;

public class GetCountCompletedTasks implements CatalogRetry<Integer> {

  private Catalog imageStore;
  private String search;

  public GetCountCompletedTasks(Catalog imageStore, String search) {
    this.imageStore = imageStore;
    this.search = search;
  }

  @Override
  public Integer run() {
    return imageStore.getCountCompletedTasks(search);
  }
}

