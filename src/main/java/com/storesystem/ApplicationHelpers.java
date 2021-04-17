package com.storesystem;

import com.storesystem.persistence.model.ItemEntity;
import java.util.ArrayList;
import java.util.List;

public class ApplicationHelpers {
    public static boolean isAdmin = false;
    public static String username;
    public static List<ItemEntity> orderedItems = new ArrayList<>();
    public static String [] months = {
        "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"
    };
}