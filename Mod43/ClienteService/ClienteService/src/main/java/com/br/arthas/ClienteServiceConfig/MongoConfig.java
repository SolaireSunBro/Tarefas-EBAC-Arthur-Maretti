/**
 * 
 */
package com.br.arthas.ClienteServiceConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author rodrigo.pires
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.rpires.ClienteServiceProfessor.repository")
public class MongoConfig {

}
