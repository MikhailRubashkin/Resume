package resume.ropository.impl;

import resume.ropository.EntytiRepository;

public abstract class BaseRepositoty<T> implements EntytiRepository {
    protected static volatile EntytiRepository INSTANCE = null;
}
