package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.models.tasks.Task;

import java.util.List;

public interface IReceiveNewEntries {
    void GotAdditionalItems(List<Task> items);
}
