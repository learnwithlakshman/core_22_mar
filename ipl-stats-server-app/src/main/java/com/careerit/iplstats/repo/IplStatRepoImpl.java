package com.careerit.iplstats.repo;

import org.springframework.beans.factory.annotation.Autowired;

public class IplStatRepoImpl implements IplStatDao {

        @Autowired
        private PlayerRepo playerRepo;
        @Autowired
        private TeamRepo teamRepo;
}
