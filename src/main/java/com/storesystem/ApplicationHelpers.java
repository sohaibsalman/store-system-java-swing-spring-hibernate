package com.storesystem;

import com.storesystem.persistence.model.ItemEntity;
import java.util.ArrayList;
import java.util.List;

public class ApplicationHelpers {
    public static boolean isAdmin = false;
    public static String username;
    public static List<ItemEntity> orderedItems = new ArrayList<>();
}