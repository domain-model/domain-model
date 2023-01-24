package com.domainmodel.hotel;

import java.util.List;

public interface Room {
    Hotel getHotel();

    List<RoomOption> getRoomOptions();
}
