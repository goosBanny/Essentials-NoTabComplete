package com.earth2me.essentials.utils;

import com.earth2me.essentials.Essentials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskUtil {

    private static Essentials plugin;

    public static final ExecutorService THREAD = Executors.newFixedThreadPool(4,
            r -> new Thread(r, "Essentials Async Processor Thread (x4)")
    );
    public static final ExecutorService MESSENGER_THREAD = Executors.newFixedThreadPool(1,
            r -> new Thread(r, "Essentials Message Processor Thread (x1)")
    );
    public TaskUtil(Essentials plugin) {
        this.plugin = plugin;
    }

    public static void runAsync(Runnable task) {
        THREAD.execute(task);
    }
    public static void runAsyncBukkit(Runnable task) {
        plugin.runTaskAsynchronously(task);
    }

    public static void runAsyncMessenger(Runnable task) { MESSENGER_THREAD.execute(task);}

    public static void runSync(Runnable task) {
        plugin.runTaskSync(task);
    }

    public static void shutdown() {
        THREAD.shutdown();
    }
}