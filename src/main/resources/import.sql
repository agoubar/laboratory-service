
-- artifact

INSERT INTO public.artifact (id, artifactid, groupid) VALUES (1, 'laboratory', 'com.manpower.laboratory');

-- artifact_version

INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (1, '1.0.0', 1);
INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (2, '1.0.1-SNAPSHOT', 1);

-- framework

INSERT INTO public.framework (id, name) VALUES (1, 'quarkus');

-- framework_version

INSERT INTO public.framework_version (id, number, framework_id) VALUES (1, '0.16.1', 1);

-- artifact_framework

INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (1, 1);
INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (2, 1);

-- os

INSERT INTO public.os (id, name) VALUES (1, 'Red Hat');
INSERT INTO public.os (id, name) VALUES (2, 'Windows');

-- os_version

INSERT INTO public.os_version (id, number, os_id) VALUES (1, '6', 1);
INSERT INTO public.os_version (id, number, os_id) VALUES (2, '7', 1);
INSERT INTO public.os_version (id, number, os_id) VALUES (3, 'XP', 2);

-- server

INSERT INTO public.server (id, ip, name, os_version_id) VALUES (1, '10.0.32.83', 'oleniok', 1);
INSERT INTO public.server (id, ip, name, os_version_id) VALUES (2, '10.0.32.84', 'olekma', 1);
INSERT INTO public.server (id, ip, name, os_version_id) VALUES (3, '10.0.32.84', 'okhota', 1);

-- artifact_instance

INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (1, 'PROD', 1, 1);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (2, 'PROD', 1, 2);
INSERT INTO public.artifact_instance (id, environmenttype, artifact_version_id, server_id) VALUES (3, 'INT', 2, 3);

-- middleware

INSERT INTO public.middleware (id, code, name) VALUES (1, 'JAVA', 'Java');
INSERT INTO public.middleware (id, code, name) VALUES (2, 'HTTP_SERVER', 'HTTP Server');

-- middleware_version

INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (1, 'Oracle', '1.8.123', 1, '2018-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (2, 'Amazon Corretto', '11.0.1', 1, '2023-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (3, 'Apache', '2.2', 2, '2015-01-01');
INSERT INTO public.middleware_version (id, editor, number, middleware_id, end_of_support) VALUES (4, 'Apache', '2.4', 2, '2020-01-01');

-- middleware_instance

INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (1, 2, 1);
INSERT INTO public.middleware_instance (id, middleware_version_id, server_id) VALUES (2, 3, 1);

-- datastore

INSERT INTO public.datastore (id, name, type) VALUES (1, 'DB2', 'DATABASE');
INSERT INTO public.datastore (id, name, type) VALUES (2, 'PostgreSQL', 'DATABASE');
INSERT INTO public.datastore (id, name, type) VALUES (3, 'RabbitMQ', 'MESSAGING');

-- datastore_version

INSERT INTO public.datastore_version (id, number, datastore_id) VALUES (1, '11.1.4', 1);
INSERT INTO public.datastore_version (id, number, datastore_id) VALUES (2, '9', 2);
INSERT INTO public.datastore_version (id, number, datastore_id) VALUES (3, '2', 3);

-- datastore_instance

INSERT INTO public.datastore_instance (id, datastore_version_id, server_id) VALUES (1, 1, 3);
INSERT INTO public.datastore_instance (id, datastore_version_id, server_id) VALUES (2, 3, 3);
