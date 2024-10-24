package HotelAppExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_shouldSetToOccupiedAndDirty() {
        // arrange
        Room room = new Room(3, 120.00, true, true);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied());
    }

    @Test
    void checkOut_shouldSetToNotOccupiedButDirty() {
        // arrange
        Room room = new Room(3, 120.00, false, true);
        // act
        room.checkOut();
        // assert
        assertTrue(room.checkOut());
    }

    @Test
    void cleanRoom_shouldSetToAvailable() {
        // arrange
        Room room = new Room(3, 120.00, false, false);
        // act
        room.cleanRoom();
        // assert
        assertFalse(room.checkOut());
    }
}