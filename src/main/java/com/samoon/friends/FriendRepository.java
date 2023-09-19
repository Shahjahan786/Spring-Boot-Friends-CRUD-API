package com.samoon.friends;

import java.util.Collection;
import java.util.HashMap;

public class FriendRepository implements IFriendRepository<Friend>{

    HashMap<Long, Friend> friends;

    FriendRepository(){
        friends = new HashMap<>();
    }
    

    @Override
    public void save(Friend t) {
        friends.put(t.getId(), t);
    }

    @Override
    public Collection<Friend> get() {
        return friends.values();
    }

    @Override
    public void delete(long id) {
        friends.remove(id);
    }
    
}
