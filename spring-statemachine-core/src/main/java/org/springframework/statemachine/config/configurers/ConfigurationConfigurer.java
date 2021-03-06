/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.statemachine.config.configurers;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.common.annotation.AnnotationConfigurerBuilder;

/**
 * Base {@code ConfigConfigurer} interface for configuring generic config.
 *
 * @author Janne Valkealahti
 *
 * @param <S> the type of state
 * @param <E> the type of event
 */
public interface ConfigurationConfigurer<S, E> extends
		AnnotationConfigurerBuilder<StateMachineConfigurationConfigurer<S, E>> {

	/**
	 * Specify a {@link BeanFactory}.
	 *
	 * @param beanFactory the bean factory
	 * @return configurer for chaining
	 */
	ConfigurationConfigurer<S, E> beanFactory(BeanFactory beanFactory);

	/**
	 * Specify a {@link TaskExecutor}.
	 *
	 * @param beanFactory the bean factory
	 * @return configurer for chaining
	 */
	ConfigurationConfigurer<S, E> taskExecutor(TaskExecutor taskExecutor);

	/**
	 * Specify a {@link TaskScheduler}.
	 *
	 * @param beanFactory the bean factory
	 * @return configurer for chaining
	 */
	ConfigurationConfigurer<S, E> taskScheduler(TaskScheduler taskScheduler);

}
