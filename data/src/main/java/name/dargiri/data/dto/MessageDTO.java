package name.dargiri.data.dto;

import java.util.UUID;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public class MessageDTO {

    public final UUID id;
    public final UUID accountId;
    public final String message;
    public final long date;
    public final boolean isDeleted;

    public MessageDTO(UUID id, UUID accountId, String message, long date, boolean isDeleted) {
        this.id = id;
        this.accountId = accountId;
        this.message = message;
        this.date = date;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public String getMessage() {
        return message;
    }

    public long getDate() {
        return date;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
