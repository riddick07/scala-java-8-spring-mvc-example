package name.dargiri.data.dto;

import name.dargiri.data.model.Account;

import java.util.UUID;

public class DataStorageDTO {

    public final UUID id;
    public final Account account;
    public final String path;
    public final String name;
    public final String catalog;
    public final String type;
    public final String description;
    public final Long date;

    public DataStorageDTO(UUID id, Account account, String path, String name, String catalog, String type, String description, Long date) {
        this.id = id;
        this.account = account;
        this.path = path;
        this.name = name;
        this.catalog = catalog;
        this.type = type;
        this.description = description;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getCatalog() {
        return catalog;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Long getDate() {
        return date;
    }
}
