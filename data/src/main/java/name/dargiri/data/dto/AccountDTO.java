package name.dargiri.data.dto;

import name.dargiri.data.dto.enums.AccountTypeEnum;

import java.util.List;
import java.util.UUID;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public class AccountDTO {

    public final UUID id;
    public final AccountTypeEnum type;
    public final String title;
    public final List<MessageDTO> messages;

    public AccountDTO(UUID id, AccountTypeEnum type, String title, List<MessageDTO> messages) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.messages = messages;
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
