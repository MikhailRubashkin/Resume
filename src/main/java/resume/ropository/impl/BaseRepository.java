package resume.ropository.impl;

import resume.ropository.EntytiRepository;

public abstract class BaseRepository<T> implements EntytiRepository {
    protected static volatile EntytiRepository INSTANCE = null;
}
