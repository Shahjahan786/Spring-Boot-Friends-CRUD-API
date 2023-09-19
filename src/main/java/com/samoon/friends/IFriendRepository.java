package com.samoon.friends;

import java.util.Collection;

public interface IFriendRepository<T> {
    
    void save(T t);
    Collection<T> get();
    void delete(long id);

}
