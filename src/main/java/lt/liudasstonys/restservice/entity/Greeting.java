package lt.liudasstonys.restservice.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Greeting {
    private final long id;
    private final String content;
}
