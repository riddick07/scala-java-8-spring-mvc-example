package name.dargiri.data.dto;

import name.dargiri.data.dto.enums.AccountTypeEnum;

import java.util.UUID;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public class AccountDTO {

    public final UUID id;
    public final AccountTypeEnum type;
    public final String title;

    public AccountDTO(UUID id, AccountTypeEnum type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public AccountTypeEnum getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
