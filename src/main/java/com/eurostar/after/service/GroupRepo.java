package com.eurostar.after.service;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class GroupRepo {
  private final ConcurrentHashMap<UUID, Group> groups = new ConcurrentHashMap<>();

  public Group get(UUID uuid) {
    return groups.get(uuid);
  }

  public Group create(Group group) {
    System.out.println("New Group gets added now!!");
    UUID uuid = UUID.randomUUID();
    Group groupWithId = new Group(uuid, group.getName());
    groups.put(uuid, groupWithId);
    return groupWithId;
  }

  public void update(Group group) {
    groups.put(group.getUuid(), group);
  }

  public Collection<Group> getAll() {
    return groups.values();
  }

  public void delete(UUID uuid) {
    groups.remove(uuid);
  }
}
