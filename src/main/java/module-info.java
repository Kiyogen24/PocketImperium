/**
 * This module contains the game Pocket Imperium playable with a Javafx interface
 */
module pimperium {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.media;
    requires transitive javafx.graphics;
    requires transitive java.desktop;
    requires java.sql;

    opens pimperium.controllers to javafx.fxml;
    opens pimperium.views to javafx.fxml;
    
    exports pimperium.controllers;
    exports pimperium.views;
    exports pimperium.models;
    exports pimperium.commands;
    exports pimperium.players;
    exports pimperium.elements;
    exports pimperium.utils;
}