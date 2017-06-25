package se;

import org.apache.log4j.Logger;

/**
 * Created by zyf10 on 2017/6/25.
 */
public class Se {
    private final Logger logger = Logger.getLogger(Se.class.getName());
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Se.class.getName());
        logger.error("error!");
    }
}
