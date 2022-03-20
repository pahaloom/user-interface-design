package pahaloom.tripmanager.api;

import java.util.List;
import java.util.UUID;

public class Trip {
    private UUID id;
    private String title;
    private List<Participant> participants;
}