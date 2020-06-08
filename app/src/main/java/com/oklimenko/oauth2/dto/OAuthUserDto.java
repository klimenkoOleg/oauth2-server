package com.oklimenko.oauth2.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.oklimenko.oauth2.util.DateFormat.DATE_WITH_TIME_PATTERN;
import static com.oklimenko.oauth2.util.DateFormat.TIMEZONE;

/**
 * Successful result details
 */
@JsonInclude(NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class OAuthUserDto {

  private Long id;
  private String resourceIds;
  private String clientSecret;
  private String scope;
  private String authorizedGrantTypes;
  private String webServerRedirectUri;
  private String authorities;
  private Integer accessTokenValidity;
  private Integer refreshTokenValidity;
  private String additional_information;
  private String autoapprove;
  @JsonFormat(shape = STRING, pattern = DATE_WITH_TIME_PATTERN, timezone = TIMEZONE)
  private LocalDateTime timestamp;


//  user_id               VARCHAR(256) PRIMARY KEY,
//  resource_ids            VARCHAR(256),
//  client_secret           VARCHAR(256),
//  scope                   VARCHAR(256),
//  authorized_grant_types  VARCHAR(256),
//  web_server_redirect_uri VARCHAR(256),
//  authorities             VARCHAR(256),
//  access_token_validity   INTEGER,
//  refresh_token_validity  INTEGER,
//  additional_information  VARCHAR(4096),
//  autoapprove
}
