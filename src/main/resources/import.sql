
-- artifact

INSERT INTO public.artifact (id, artifactid, groupid) VALUES (1, 'laboratory', 'com.manpower.laboratory');
INSERT INTO public.artifact (id, artifactid, groupid) VALUES (2, 'laboratory-ui', 'com.manpower.laboratory');

-- artifact_version

INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (1, '1.0.0', 1);
INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (2, '1.0.2-SNAPSHOT', 1);
INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (3, '1.0.1', 1);
INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (4, '1.0.0', 2);

-- framework

INSERT INTO public.framework (id, name) VALUES (1, 'quarkus');

-- framework_version

INSERT INTO public.framework_version (id, number, framework_id) VALUES (1, '0.16.1', 1);
INSERT INTO public.framework_version (id, number, framework_id) VALUES (2, '0.19.1', 1);

-- artifact_framework

INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (1, 1);
INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (2, 1);
INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (3, 1);

-- os

INSERT INTO public.os (id, name) VALUES (1, 'Red Hat');
INSERT INTO public.os (id, name) VALUES (2, 'Windows');

-- os_version

INSERT INTO public.os_version (id, number, os_id, end_of_support) VALUES (1, '6', 1, '2020-01-01');
INSERT INTO public.os_version (id, number, os_id, end_of_support) VALUES (2, '7', 1, '2025-01-01');
INSERT INTO public.os_version (id, number, os_id, end_of_support) VALUES (3, 'XP', 2, '1998-01-01');

-- server

INSERT INTO public.server (id, cpu, ip, name, ram, os_version_id) VALUES (1, 4, '10.0.32.83', 'oleniok', 2048, 1);
INSERT INTO public.server (id, cpu, ip, name, ram, os_version_id) VALUES (2, 4, '10.0.32.84', 'olekma', 4096, 2);
INSERT INTO public.server (id, cpu, ip, name, ram, os_version_id) VALUES (3, 4, '10.0.32.84', 'okhota', 4096, 3);

-- artifact_instance

INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (1, 'PROD', 1, 1);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (2, 'PROD', 1, 2);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (3, 'INT', 2, 3);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (4, 'REC', 3, 3);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (5, 'PROD', 4, 1);

-- middleware

INSERT INTO public.middleware (id, type, name) VALUES (1, 'JAVA', 'Java');
INSERT INTO public.middleware (id, type, name) VALUES (2, 'HTTP_SERVER', 'HTTP Server');

-- middleware_version

INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (1, 'Oracle', '1.8.123', 1, '2018-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (2, 'Amazon Corretto', '11.0.1', 1, '2023-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (3, 'Apache', '2.2', 2, '2015-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (4, 'Apache', '2.4', 2, '2020-01-01');

-- middleware_instance

INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (1, 2, 1);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (2, 3, 1);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (3, 2, 2);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (4, 4, 2);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (5, 1, 3);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (6, 3, 3);

-- artifact_middleware

INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (1, 1);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (1, 2);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (2, 3);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (2, 4);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (3, 5);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (3, 6);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (4, 5);
INSERT INTO public.artifact_middleware (artifact_instance_id, middleware_instance_id) VALUES (4, 6);

-- datastore

INSERT INTO public.datastore (id, name, type) VALUES (1, 'DB2', 'DATABASE');
INSERT INTO public.datastore (id, name, type) VALUES (2, 'PostgreSQL', 'DATABASE');
INSERT INTO public.datastore (id, name, type) VALUES (3, 'RabbitMQ', 'MESSAGING');

-- datastore_version

INSERT INTO public.datastore_version (id, number, datastore_id, end_of_support) VALUES (1, '11.1.4', 1, '2023-01-01');
INSERT INTO public.datastore_version (id, number, datastore_id, end_of_support) VALUES (2, '9', 2, '2023-01-01');
INSERT INTO public.datastore_version (id, number, datastore_id, end_of_support) VALUES (3, '2.4', 3, '2018-01-01');
INSERT INTO public.datastore_version (id, number, datastore_id, end_of_support) VALUES (4, '3.1', 3, '2020-01-01');

-- datastore_instance

INSERT INTO public.datastore_instance (id, datastore_version_id, server_id) VALUES (1, 1, 3);
INSERT INTO public.datastore_instance (id, datastore_version_id, server_id) VALUES (2, 3, 3);
INSERT INTO public.datastore_instance (id, datastore_version_id, server_id) VALUES (3, 4, 2);

-- artifact_datastore

INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (1, 1);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (1, 2);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (2, 1);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (2, 2);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (3, 1);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (3, 2);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (4, 1);
INSERT INTO public.artifact_datastore (artifact_instance_id, datastore_instance_id) VALUES (4, 3);
