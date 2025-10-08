package com.earth2me.essentials.utils;

import com.earth2me.essentials.Essentials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskUtil {

    private static Essentials plugin;

    public TaskUtil(Essentials plugin){
        TaskUtil.plugin = plugin;
    }

    public static final ExecutorService THREAD = Executors.newSingleThreadExecutor(
            r -> new Thread(r, "Essentials Async Processor Thread (x1)")
    );

    public static void runAsync(Runnable task) {
        THREAD.execute(task);
    }

    public static void runAsyncBukkit(Runnable task){
        plugin.runTaskAsynchronously(task);
    }
}