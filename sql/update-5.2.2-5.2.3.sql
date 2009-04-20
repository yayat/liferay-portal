update Group_ set name = classPK where classPK > 0 and name = '';

alter table JournalArticle add urlTitle VARCHAR(150) null;

COMMIT_TRANSACTION;

update JournalArticle set urlTitle = articleId;

alter table MBCategory add threadCount INTEGER;
alter table MBCategory add messageCount INTEGER;

alter table MBMessage add groupId LONG;
alter table MBMessage add priority DOUBLE;

alter table MBThread add groupId LONG;

alter table Organization_ add leftOrganizationId LONG;
alter table Organization_ add rightOrganizationId LONG;

COMMIT_TRANSACTION;

update Organization_ set leftOrganizationId = 0, rightOrganizationId = 0;

update Region set regionCode = 'AB' where countryId = 1 and name = 'Alberta';

create table ResourceAction (
	resourceActionId LONG not null primary key,
	name VARCHAR(75) null,
	actionId VARCHAR(75) null,
	bitwiseValue LONG
);

create table ResourcePermission (
	resourcePermissionId LONG not null primary key,
	resourceId LONG,
	roleId LONG,
	actionIds LONG
);

create table Shard (
	shardId LONG not null primary key,
	classNameId LONG,
	classPK LONG,
	name VARCHAR(75) null
);

alter table User_ add firstName VARCHAR(75) null;
alter table User_ add middleName VARCHAR(75) null;
alter table User_ add lastName VARCHAR(75) null;
alter table User_ add jobTitle VARCHAR(75) null;