package org.example;

import java.util.List;

public interface BucketItemManager {
    void addItem(BucketItem item);
    void removeItem(String title);
    void updateItem(String title);
    void markItemAsDone(String title);

    List<BucketItem> getAllItems();
}
