package data.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FakeDataSource {

    private final String username;
    private final String password;
    private final String url;
}
