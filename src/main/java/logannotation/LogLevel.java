package logannotation;

import java.util.logging.Level;

public enum LogLevel {
    OFF(Level.OFF),
    SEVERE(Level.SEVERE),
    WARNING(Level.WARNING),
    INFO(Level.INFO),
    CONFIG(Level.CONFIG),
    FINE(Level.FINE),
    FINER(Level.FINER),
    FINEST(Level.FINEST),
    ALL(Level.ALL);
    private Level level;

    LogLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
