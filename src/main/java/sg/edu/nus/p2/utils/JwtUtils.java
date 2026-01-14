package sg.edu.nus.p2.utils;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sg.edu.nus.p2.Service.TokenCacheService;
import sg.edu.nus.p2.repository.UserRepository;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${jwt.secret-key}")
    private String secretKeyBase64;

    private static final long EXPIRATION_TIME_MS = 60 * 60 * 1000; // 1 hour
    private static final long REFRESH_TIME_MS = 7 * 24 * 60 * 60 * 1000; // 24 * 7 hours
    private static final long REFRESH_THRESHOLD = 300000; // 5 minutes
    private static final long REFRESH_WINDOW = 600000; // 10分钟：token过期后的宽限期

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenCacheService tokenCacheService;











}

